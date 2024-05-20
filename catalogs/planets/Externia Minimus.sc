Moon	"Minimus/Externia I"
{
	ParentBody     "Externia-Clulesc bar"
	Class          "Aquaria"
	Mass            9.07e-05
	Radius          345
	InertiaMoment   0.399
	Obliquity       1
	EqAscendNode    -107
	TidalLocked     true

	EndogenousHeating 0
	Albedo          0.8
	Brightness      1
	BrightnessReal  1
	Color          (0.732 0.731 0.730)

	Surface
	{
		Preset         "externia_minimus.cfg"
		SurfStyle       0.778
		Randomize      (0.901, 1.237, 1.176)
		colorDistMagn   0.0552
		colorDistFreq   50.9
		detailScale     1
		drivenDarkening 0.145
		seaLevel        0.351
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
		mainFreq        1.41
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
		eqridgeMagn     0.252
		eqridgeWidth    1
		eqridgeModMagn  2.5
		eqridgeModFreq  1.68
		canyonsMagn     0.763
		canyonsFreq     0
		canyonsFraction 0
		cracksMagn      0.04
		cracksFreq      0.6
		cracksOctaves   15
		craterMagn      1
		craterFreq      2
		craterDensity   1
		craterOctaves   30
		craterRayedFactor 0
		volcanoMagn     0.195
		volcanoFreq     0.672
		volcanoDensity  0
		volcanoOctaves  0
		volcanoActivity 0
		volcanoFlows    0.107
		volcanoRadius   0.146
		volcanoTemp     353
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
		PeriodDays      145.007589
		SemiMajorAxisKm 14959787.1
		Eccentricity    0.0152671756
		Inclination     1
		AscendingNode   -107.175573
		ArgOfPericenter -35.7251908
		MeanAnomaly     0
	}
}

