Moon	"Maximus/Externia II"
{
	ParentBody     "Externia-Clulesc bar"
	Class          "Aquaria"
	Mass            0.000789
	Radius          748
	InertiaMoment   0.399
	Oblateness      0.00102
	RotationPeriod  3.41e+03
	RotationEpoch   1451545
	Obliquity       0
	EqAscendNode    0

	EndogenousHeating 0
	Albedo          0.7
	Brightness      1
	BrightnessReal  1
	Color          (0.775 0.751 0.714)

	Surface
	{
		Preset         "externia_maximus.cfg"
		SurfStyle       0.778
		Randomize      (-1.084, 0.015, -0.321)
		colorDistMagn   0.0552
		colorDistFreq   50.9
		detailScale     1
		drivenDarkening 0.145
		seaLevel        0.374
		snowLevel       2
		tropicLatitude  0.527
		icecapLatitude  2
		icecapHeight    0
		climatePole     1
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.414
		heightTempGrad  0.625
		beachWidth      0.001
		tropicWidth     0.07
		mainFreq        1.91
		venusFreq       1.39
		venusMagn       0
		mareFreq        0.8
		mareDensity     1
		terraceProb     0
		erosion         0
		montesMagn      0.1
		montesFreq      25
		montesSpiky     1
		montesFraction  1
		dunesMagn       0.0342
		dunesFreq       3.77
		dunesFraction   0.588
		hillsMagn       0.1
		hillsFreq       25
		hillsFraction   1
		hills2Fraction  1
		riversMagn      0
		riversFreq      2.54
		riversSin       5.37
		riftsMagn       0
		riftsFreq       7
		riftsSin        7
		eqridgeMagn     0.466
		eqridgeWidth    1
		eqridgeModMagn  2.5
		eqridgeModFreq  2.44
		canyonsMagn     0.763
		canyonsFreq     0
		canyonsFraction 0
		cracksMagn      0.04
		cracksFreq      0.6
		cracksOctaves   15
		craterMagn      2
		craterFreq      2
		craterDensity   1
		craterOctaves   30
		craterRayedFactor 0
		volcanoMagn     1
		volcanoFreq     2
		volcanoDensity  0
		volcanoOctaves  5
		volcanoActivity 2
		volcanoFlows    1
		volcanoRadius   1
		volcanoTemp     3e+03
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      20
		DiffMapAlpha   "Ice"
		SpecBrightWater 2
		SpecBrightIce   0.03
		RoughnessWater  0.275
		RoughnessIce    0.45
		SpecularScale   0.992
		RoughnessBias   1
		Hapke           0.7
		SpotBright      2.75
		SpotWidth       0.05
		SpotBrightCB    2.44
		SpotWidthCB     0.0164
		DayAmbient      0.07
	}

	NoOcean         true

	NoClouds        true

	NoLava          true

	NoAtmosphere    true

	Climate
	{
		GlobalWindSpeed  0
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      290.015177
		SemiMajorAxisKm 23747180.7
		Eccentricity    0.0458015267
		Inclination     1
		AscendingNode   68.7022901
		ArgOfPericenter -101.679389
		MeanAnomaly     0
	}
}

