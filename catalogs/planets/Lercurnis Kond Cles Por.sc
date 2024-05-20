Moon	"Por/Lercurnis B VIII I"
{
	ParentBody     "Cles"
	Class          "Carbonia"
	Mass            0.000125
	Radius          351
	InertiaMoment   0.399
	Oblateness      0.00544
	Obliquity       0
	EqAscendNode    0
	TidalLocked     true

	EndogenousHeating 1.45e+03
	Albedo          0.04
	Brightness      1
	BrightnessReal  1

	Surface
	{
		Preset         "lercurnis_kond_cles_por.cfg"
		SurfStyle       0.5
		Randomize      (0.419, 0.213, 0.457)
		colorDistMagn   0.0546
		colorDistFreq   40.6
		detailScale     128
		drivenDarkening 0.42
		seaLevel        0.106
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  2
		icecapHeight    0.594
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.215
		heightTempGrad  0.625
		beachWidth      0.0012
		tropicWidth     0.07
		mainFreq        0.763
		venusFreq       0.763
		venusMagn       0.878
		mareFreq        5
		mareDensity     0.0611
		terraceProb     0.475
		erosion         0
		montesMagn      0.2
		montesFreq      25
		montesSpiky     1
		montesFraction  1
		dunesMagn       0.0582
		dunesFreq       3.35
		dunesFraction   0.103
		hillsMagn       1
		hillsFreq       25
		hillsFraction   1
		hills2Fraction  1
		riversMagn      15.3
		riversFreq      3.16
		riversSin       10
		riftsMagn       100
		riftsFreq       10
		riftsSin        10
		eqridgeMagn     0.229
		eqridgeWidth    1
		eqridgeModMagn  2.5
		eqridgeModFreq  10
		canyonsMagn     0.514
		canyonsFreq     0.138
		canyonsFraction 0.0272
		cracksMagn      0.0374
		cracksFreq      0.113
		cracksOctaves   0
		craterMagn      1
		craterFreq      2
		craterDensity   1
		craterOctaves   30
		craterRayedFactor 0
		volcanoMagn     0
		volcanoFreq     0.931
		volcanoDensity  0.473
		volcanoOctaves  5
		volcanoActivity 2
		volcanoFlows    1
		volcanoRadius   1
		volcanoTemp     1.9e+03
		lavaCoverTidal  1
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      16.4
		SpecBrightWater 0
		SpecBrightIce   0.03
		RoughnessWater  0.35
		RoughnessIce    0.45
		SpecularScale   1
		RoughnessBias   0.8
		Hapke           1
		SpotBright      2.5
		SpotWidth       0.05
		DayAmbient      0.07
		TempMapMaxTemp  7.68e+04
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
		PeriodDays      0.660269765
		SemiMajorAxisKm 337261.868
		Eccentricity    0.03
		Inclination     0
		AscendingNode   0
		ArgOfPericenter 0
		MeanAnomaly     5
	}
}

