Moon	"Maximus/Externia II"
{
	ParentBody     "Externia-Clulesc bar"
	Class          "Aquaria"
	Mass            0.00078874
	Radius          747.91
	InertiaMoment   0.39853
	OblatenessInfo  0.0010156
	RotationPeriod  3411
	RotationEpoch   1451545
	Obliquity       0
	EqAscendNode    0
    Oblateness      0

	Albedo          0.8
	Brightness      1
	BrightnessReal  1

	Surface
	{
		Preset         "externia_maximus.cfg"
		SurfStyle       0.77836
		Randomize      (-1.084, 0.015, -0.321)
		colorDistMagn   0.055211
		colorDistFreq   50.904
		detailScale     1
		drivenDarkening 0.14504
		seaLevel        0.37405
		snowLevel       2
		tropicLatitude  0.52733
		icecapLatitude  2
		icecapHeight    0
		climatePole     1
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.41418
		heightTempGrad  0.625
		beachWidth      0.0010039
		tropicWidth     0.07
		mainFreq        1.9084
		venusFreq       1.3893
		venusMagn       0
		mareFreq        0.8
		mareDensity     1
		terraceProb     0
		erosion         0
		montesMagn      0.1
		montesFreq      25
		montesSpiky     1
		montesFraction  1
		dunesMagn       0.034227
		dunesFreq       3.7696
		dunesFraction   0.588
		hillsMagn       0.1
		hillsFreq       25
		hillsFraction   1
		hills2Fraction  1
		riversMagn      0
		riversFreq      2.5389
		riversSin       5.366
		riftsMagn       0
		riftsFreq       7
		riftsSin        7
		eqridgeMagn     0.46565
		eqridgeWidth    1
		eqridgeModMagn  2.5
		eqridgeModFreq  2.4427
		canyonsMagn     0.76336
		canyonsFreq     0
		canyonsFraction 0
		cracksMagn      0.04
		cracksFreq      0.59999
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
		volcanoTemp     3000
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      20
		DiffMapAlpha   "Ice"
		SpecBrightWater 2
		SpecBrightIce   0.03
		RoughnessWater  0.27481
		RoughnessIce    0.45
		SpecularScale   0.99237
		RoughnessBias   1
		Hapke           0.7
		SpotBright      2.7481
		SpotWidth       0.05
		SpotBrightCB    2.4427
		SpotWidthCB     0.016358
		DayAmbient      0.07
	}

	NoOcean         true

	NoClouds        true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      290.015177
		SemiMajorAxisKm 23747180.7
		Eccentricity    0
		Inclination     0
		AscendingNode   0
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}
