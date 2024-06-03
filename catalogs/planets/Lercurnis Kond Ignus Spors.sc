DwarfMoon	"Spors/Lercurnis B V I"
{
	ParentBody     "Ignus"
	Class          "Asteroid"
	Mass            1.41e-09
	Radius          8
	InertiaMoment   0.399
	Oblateness      0.00125
	Obliquity       172
	EqAscendNode    -140
	TidalLocked     true

	AbsMagn         10.7
	SlopeParam      3.53
	AlbedoBond      0.6
	AlbedoGeom      0.67
	Brightness      0.5
	BrightnessReal  1

	Surface
	{
		Preset         "lercurnis_kond_ignus_spors.cfg"
		SurfStyle       0.264
		Randomize      (-0.748, 1.298, 0.412)
		colorDistMagn   0.742
		colorDistFreq   0.0301
		detailScale     16
		drivenDarkening 0
		seaLevel        0.832
		snowLevel       2
		tropicLatitude  0.00175
		icecapLatitude  2
		icecapHeight    0.527
		climatePole     0.438
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.257
		heightTempGrad  0.625
		beachWidth      0.00114
		tropicWidth     0.07
		mainFreq        0.573
		venusFreq       0.366
		venusMagn       0.42
		mareFreq        1e+03
		mareDensity     1
		terraceProb     0.159
		erosion         0
		montesMagn      0
		montesFreq      1e+03
		montesSpiky     1
		montesFraction  1
		dunesFraction   0
		hillsMagn       10
		hillsFreq       50
		hillsFraction   1
		hills2Fraction  1
		eqridgeMagn     1
		eqridgeWidth    1
		eqridgeModMagn  2.5
		eqridgeModFreq  0.2
		canyonsFraction 0
		craterMagn      0.2
		craterFreq      0.2
		craterDensity   1
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.555
		volcanoTemp     281
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      7.82
		SpecBrightWater 0
		SpecBrightIce   0
		RoughnessWater  0
		RoughnessIce    0
		SpecularScale   0
		RoughnessBias   0.8
		RoughnessScale  0
		Gamma           5
		Hapke           0.595
		SpotBright      20
		SpotWidth       0.0113
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

	CometTail
	{
		MaxLength   1.33e-05
		GasToDust   0
		Particles   10000
		GasBright   0.001
		DustBright  0.0254
		GasColor   (0.000 0.000 0.000)
		DustColor  (0.016 0.023 0.031)
	}

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      2.19145314
		SemiMajorAxisKm 146579.846
		Eccentricity    0.05
		Inclination     172
		AscendingNode   -140.152672
		ArgOfPericenter 57.7099237
		MeanAnomaly     2.7480916
	}
}

